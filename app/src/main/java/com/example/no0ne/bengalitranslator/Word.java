package com.example.no0ne.bengalitranslator;

/**
 * Created by no0ne on 9/7/16.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Bengali translation, and an image for that word.
 */
public class Word {
    /** Default and Bengali translation for the word */
    private String mDefaultTranslation, mBengaliTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param bengaliTranslation is the word in the Bengali language
     */
    public Word(String defaultTranslation, String bengaliTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mBengaliTranslation = bengaliTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param bengaliTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String bengaliTranslation, int imageResourceId, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mBengaliTranslation = bengaliTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Bengali translation of the word.
     */
    public String getBengaliTranslation() {
        return mBengaliTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mBengaliTranslation='" + mBengaliTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
