FROM ubuntu
RUN apt update && apt install python3 python3-pip -yy


# Below code is to be removed before challenge
RUN useradd -m -d /nonroot nonroot 
USER nonroot
COPY hello.py index.html requirements.txt /nonroot/app/
WORKDIR /nonroot/app
# Above code is to be removed before challenge

RUN pip3 install -r requirements.txt
CMD ["python3","hello.py"]
EXPOSE 9999
