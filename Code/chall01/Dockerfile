FROM ubuntu
RUN apt update && apt install python3 python3-pip -yy

# Your code starts below
RUN useradd -m -d /nonroot nonroot
USER nonroot
# Your code ends above

COPY hello.py requirements.txt /nonroot/app/
WORKDIR /nonroot/app
RUN pip3 install -r requirements.txt
CMD ["python3","hello.py"]
EXPOSE 9999
