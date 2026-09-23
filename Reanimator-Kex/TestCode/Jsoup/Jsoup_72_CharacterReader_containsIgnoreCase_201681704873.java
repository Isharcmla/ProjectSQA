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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_containsIgnoreCase_201681704873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3943;

    public CharacterReader_containsIgnoreCase_201681704873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3943 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3944 = (char[]) newCharArray(0);
        Object[] term3950 = (Object[]) newArray("java.lang.String", 6);
        setField(term3943, term3943.getClass(), "charBuf", term3944);
        setField(term3943, term3943.getClass(), "reader", null);
        setIntField(term3943, term3943.getClass(), "bufLength", 1830648570);
        setIntField(term3943, term3943.getClass(), "bufSplitPoint", -227365013);
        setIntField(term3943, term3943.getClass(), "bufPos", 11724947);
        setIntField(term3943, term3943.getClass(), "readerPos", 1953277050);
        setIntField(term3943, term3943.getClass(), "bufMark", 1283079251);
        setElement(term3950, 0, "VYkqXKVlAJ");
        setElement(term3950, 1, "XkIoWJRNwN");
        setElement(term3950, 2, "aNWLJdrZMq");
        setElement(term3950, 3, "HHmNoYxIGj");
        setElement(term3950, 4, "PtirvZmsGt");
        setElement(term3950, 5, "HWkpTmtlrc");
        setField(term3943, term3943.getClass(), "stringCache", term3950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        try {
            callMethod(klass, "containsIgnoreCase", argTypes, term3943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


