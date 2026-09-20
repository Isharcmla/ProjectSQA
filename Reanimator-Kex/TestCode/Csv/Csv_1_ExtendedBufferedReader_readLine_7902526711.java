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
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExtendedBufferedReader_readLine_7902526711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public ExtendedBufferedReader_readLine_7902526711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term95 = (char[]) newCharArray(6);
        Object term108 = newInstance(Class.forName("java.lang.Object"));
        char[] term109 = (char[]) newCharArray(7);
        setIntField(term92, term92.getClass(), "lastChar", -655067527);
        setIntField(term92, term92.getClass(), "lineCounter", -6029667);
        setField(term92, term92.getClass(), "in", null);
        setCharElement(term95, 0, 'Q');
        setCharElement(term95, 1, 'H');
        setCharElement(term95, 2, 'g');
        setCharElement(term95, 3, 'q');
        setCharElement(term95, 4, 'z');
        setCharElement(term95, 5, 'x');
        setField(term92, term92.getClass(), "cb", term95);
        setIntField(term92, term92.getClass(), "nChars", -2068769794);
        setIntField(term92, term92.getClass(), "nextChar", -117576464);
        setIntField(term92, term92.getClass(), "markedChar", -1007160944);
        setIntField(term92, term92.getClass(), "readAheadLimit", 1135664017);
        setBooleanField(term92, term92.getClass(), "skipLF", true);
        setBooleanField(term92, term92.getClass(), "markedSkipLF", true);
        setField(term92, term92.getClass(), "lock", term108);
        setCharElement(term109, 0, 'x');
        setCharElement(term109, 1, 't');
        setCharElement(term109, 2, 'l');
        setCharElement(term109, 3, 'P');
        setCharElement(term109, 4, 'w');
        setCharElement(term109, 5, 'D');
        setCharElement(term109, 6, 'Y');
        setField(term92, term92.getClass(), "skipBuffer", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readLine", argTypes, term92, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
