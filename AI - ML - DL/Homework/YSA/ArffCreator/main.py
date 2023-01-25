import shutil
from random import randrange

file = open("dataSet1.arff", "w+")

# Static area
file.write("@relation dataSet\n")
file.write("@attribute fileName string\n")
file.write("@attribute class {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine}\n")
file.write("@data\n")

# taking 500 images per class
# in dataset the image names between "image1" and "image1000"
for i in range(900):
    shutil.copy("DigitDataset\\Zero\\image" + str(i + 1) + ".png", "ImageMixed\\image0" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\One\\image" + str(i + 1) + ".png", "ImageMixed\\image1" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Two\\image" + str(i + 1) + ".png", "ImageMixed\\image2" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Three\\image" + str(i + 1) + ".png", "ImageMixed\\image3" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Four\\image" + str(i + 1) + ".png", "ImageMixed\\image4" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Five\\image" + str(i + 1) + ".png", "ImageMixed\\image5" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Six\\image" + str(i + 1) + ".png", "ImageMixed\\image6" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Seven\\image" + str(i + 1) + ".png", "ImageMixed\\image7" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Eight\\image" + str(i + 1) + ".png", "ImageMixed\\image8" + str(i + 1) + ".png")
    shutil.copy("DigitDataset\\Nine\\image" + str(i + 1) + ".png", "ImageMixed\\image9" + str(i + 1) + ".png")

    file.write("image0" + str(i + 1) + ".png, Zero\n")
    file.write("image1" + str(i + 1) + ".png, One\n")
    file.write("image2" + str(i + 1) + ".png, Two\n")
    file.write("image3" + str(i + 1) + ".png, Three\n")
    file.write("image4" + str(i + 1) + ".png, Four\n")
    file.write("image5" + str(i + 1) + ".png, Five\n")
    file.write("image6" + str(i + 1) + ".png, Six\n")
    file.write("image7" + str(i + 1) + ".png, Seven\n")
    file.write("image8" + str(i + 1) + ".png, Eight\n")
    file.write("image9" + str(i + 1) + ".png, Nine\n")

file.close()