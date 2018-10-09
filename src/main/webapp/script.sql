
CREATE TABLE public.genders
(
   gender character varying(255) 
);
CREATE TABLE public.hobbies
(
   hobbie character varying(255) 
);
CREATE TABLE public.grades
(
   grade character varying(255) 
);
  
  INSERT INTO public.genders( gender) VALUES ('male');
INSERT INTO public.genders( gender) VALUES ('female');


INSERT INTO public.grades( grade) VALUES ('G1');
INSERT INTO public.grades( grade) VALUES ('G2');
INSERT INTO public.grades( grade) VALUES ('G3');
INSERT INTO public.grades( grade) VALUES ('G4');
  
INSERT INTO public.hobbies( hobbie) VALUES ('CAR');
INSERT INTO public.hobbies( hobbie) VALUES ('Music');
INSERT INTO public.hobbies( hobbie) VALUES ('dance');
INSERT INTO public.hobbies( hobbie) VALUES ('chating');
