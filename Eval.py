
# importing the module
from pytube import YouTube

# where to save
SAVE_PATH = "E:/"  # to_do

# link of the video to be downloaded

# link="https://www.youtube.com/watch?v=jRxEjmjIIFs&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=39"
link="https://www.youtube.com/shorts/aZgIoG03oCY"

try:
    # object creation using YouTube
    # which was imported in the beginning
    yt = YouTube(link)
except:
    print("Connection Error")  # to handle exception

# filters out all the files with "mp4" extension
# mp4files = yt.filter('mp4')
# mp4files = yt.streams.filter(progressive=True, file_extension='webm').order_by(
    # 'resolution')[-1].download()

print("Successfull !!!")