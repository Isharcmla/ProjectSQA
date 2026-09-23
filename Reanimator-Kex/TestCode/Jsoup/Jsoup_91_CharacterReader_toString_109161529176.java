package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_toString_109161529176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3945;

    public CharacterReader_toString_109161529176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3945 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3946 = (char[]) newCharArray(0);
        Object[] term3952 = (Object[]) newArray("java.lang.String", 6);
        setField(term3945, term3945.getClass(), "charBuf", term3946);
        setField(term3945, term3945.getClass(), "reader", null);
        setIntField(term3945, term3945.getClass(), "bufLength", 1384592638);
        setIntField(term3945, term3945.getClass(), "bufSplitPoint", -1002370457);
        setIntField(term3945, term3945.getClass(), "bufPos", -2014576105);
        setIntField(term3945, term3945.getClass(), "readerPos", 1296895584);
        setIntField(term3945, term3945.getClass(), "bufMark", 628918458);
        setElement(term3952, 0, "ZfdXfCCFDf");
        setElement(term3952, 1, "MwwjNtdOFT");
        setElement(term3952, 2, "VYkqXKVlAJ");
        setElement(term3952, 3, "XkIoWJRNwN");
        setElement(term3952, 4, "aNWLJdrZMq");
        setElement(term3952, 5, "HHmNoYxIGj");
        setField(term3945, term3945.getClass(), "stringCache", term3952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term3945, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


