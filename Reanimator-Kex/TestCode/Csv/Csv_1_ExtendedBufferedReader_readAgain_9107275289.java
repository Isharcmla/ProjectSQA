package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;

public class ExtendedBufferedReader_readAgain_9107275289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term838;

    public ExtendedBufferedReader_readAgain_9107275289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term34 = (char[]) newCharArray(3);
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        char[] term45 = (char[]) newCharArray(4);
        setIntField(term31, term31.getClass(), "lastChar", -1955890973);
        setIntField(term31, term31.getClass(), "lineCounter", -2038273078);
        setField(term31, term31.getClass(), "in", null);
        setCharElement(term34, 0, 'D');
        setCharElement(term34, 1, 's');
        setCharElement(term34, 2, 'j');
        setField(term31, term31.getClass(), "cb", term34);
        setIntField(term31, term31.getClass(), "nChars", 1227103734);
        setIntField(term31, term31.getClass(), "nextChar", -1339778481);
        setIntField(term31, term31.getClass(), "markedChar", 1725571209);
        setIntField(term31, term31.getClass(), "readAheadLimit", -522618178);
        setBooleanField(term31, term31.getClass(), "skipLF", false);
        setBooleanField(term31, term31.getClass(), "markedSkipLF", false);
        setField(term31, term31.getClass(), "lock", term44);
        setCharElement(term45, 0, 'l');
        setCharElement(term45, 1, 'J');
        setCharElement(term45, 2, 'A');
        setCharElement(term45, 3, 'E');
        setField(term31, term31.getClass(), "skipBuffer", term45);
        term838 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term839 = (char[]) newCharArray(3);
        Object term840 = newInstance(Class.forName("java.lang.Object"));
        char[] term841 = (char[]) newCharArray(4);
        setIntField(term838, term838.getClass(), "lastChar", -1955890973);
        setIntField(term838, term838.getClass(), "lineCounter", -2038273078);
        setField(term838, term838.getClass(), "in", null);
        setCharElement(term839, 0, 'D');
        setCharElement(term839, 1, 's');
        setCharElement(term839, 2, 'j');
        setField(term838, term838.getClass(), "cb", term839);
        setIntField(term838, term838.getClass(), "nChars", 1227103734);
        setIntField(term838, term838.getClass(), "nextChar", -1339778481);
        setIntField(term838, term838.getClass(), "markedChar", 1725571209);
        setIntField(term838, term838.getClass(), "readAheadLimit", -522618178);
        setBooleanField(term838, term838.getClass(), "skipLF", false);
        setBooleanField(term838, term838.getClass(), "markedSkipLF", false);
        setField(term838, term838.getClass(), "lock", term840);
        setCharElement(term841, 0, 'l');
        setCharElement(term841, 1, 'J');
        setCharElement(term841, 2, 'A');
        setCharElement(term841, 3, 'E');
        setField(term838, term838.getClass(), "skipBuffer", term841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readAgain", argTypes, term31, args);
        assertTrue(recursiveEquals(term31, term838));
        assertTrue(recursiveEquals(retValue, -1955890973));
    }

};
