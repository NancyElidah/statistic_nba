CREATE OR REPLACE VIEW v_equipe_joueur as
SELECT 
    j.id id_joueur, j.nom joueur, j.dtn, g.id id_genre, g.nom nom_genre, 
    e.id id_equipe, e.nom nom_equipe 
FROM joueur j 
JOIN equipe e on j.id_equipe = e.id
JOIN genre g on j.id_genre = g.id;


CREATE OR REPLACE VIEW v_match_equipe as 
SELECT 
    m.id id_match, m.date_debut, m.date_fin, m.lieu,
    e1.id id_equipe1, e1.nom nom_equipe1,
    e2.id id_equipe2, e2.nom nom_equipe2
FROM match m
JOIN equipe e1 on m.equipe1 = e1.id 
JOIN equipe e2 on m.equipe2 = e2.id;


CREATE OR REPLACE VIEW v_total_action as 
SELECT 
    id_match, id_action, count(id_action) 
FROM Player_action
group by id_action,id_match;


create or REPLACE VIEW v_stat_joueur as (
    SELECT j.id id_joueur, a.id id_action, count(a.id) total
    FROM Player_action pa 
    JOIN joueur j on j.id = pa.id_joueur
    join action a on a.id = pa.id_action
    group BY j.id , a.id
);

CREATE OR REPLACE view v_stat_all_joueur as (
    SELECT 
        j.id, j.nom, vsj.id_action, a.nom,  
        CASE
            when vsj.total is null then 0 else vsj.total 
        END total
    FROM joueur j 
    left join v_stat_joueur vsj on  j.id = vsj.id_joueur
    left join action a on a.id = vsj.id_action
);

CREATE OR REPLACE VIEW 

CREATE OR REPLACE VIEW v_joueur_action as 
SELECT 
    p_a.id_joueur, p_a.id_match,
    count(p_a.id_action),
    sum(a.point)
FROM Player_action p_a 
join action a on p_a.id_action = a.id
group by p_a.id_joueur, p_a.id_match; 


