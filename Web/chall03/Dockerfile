FROM ubuntu
RUN apt update && apt install python3 python3-pip -yy
RUN useradd -m -d /nonroot nonroot 
COPY hello.py index.html robots.html requirements.txt /nonroot/app/

USER nonroot
WORKDIR /nonroot/app

RUN pip3 install -r requirements.txt
CMD ["python3","hello.py"]
EXPOSE 9999
