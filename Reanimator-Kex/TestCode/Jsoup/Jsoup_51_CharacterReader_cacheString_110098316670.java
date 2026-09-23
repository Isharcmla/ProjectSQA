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
import java.lang.Integer;

public class CharacterReader_cacheString_110098316670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4077;
     Object term4155;
     Object term4157;

    public CharacterReader_cacheString_110098316670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4077 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4078 = (char[]) newCharArray(0);
        Object[] term4082 = (Object[]) newArray("java.lang.String", 6);
        setField(term4077, term4077.getClass(), "input", term4078);
        setIntField(term4077, term4077.getClass(), "length", 304775596);
        setIntField(term4077, term4077.getClass(), "pos", -1347665717);
        setIntField(term4077, term4077.getClass(), "mark", -1888585309);
        setElement(term4082, 0, "aWYOWZFyaX");
        setElement(term4082, 1, "BRIVNtfUWU");
        setElement(term4082, 2, "DbiCVtPPCT");
        setElement(term4082, 3, "WzFopsaDuG");
        setElement(term4082, 4, "PapWxkhEWe");
        setElement(term4082, 5, "smnHEqRFRx");
        setField(term4077, term4077.getClass(), "stringCache", term4082);
        term4155 = new Integer(683666002);
        term4157 = new Integer(1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4155;
        args[1] = term4157;
        try {
            callMethod(klass, "cacheString", argTypes, term4077, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


