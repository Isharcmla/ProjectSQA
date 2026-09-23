package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class ZoneInfoCompiler_parseDataFile_55443678232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;
     Object term537;

    public ZoneInfoCompiler_parseDataFile_55443678232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term524 = new HashMap();
        ArrayList term529 = new ArrayList();
        ArrayList term533 = new ArrayList();
        term523 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term523, term523.getClass(), "iRuleSets", term524);
        setField(term523, term523.getClass(), "iZones", term529);
        setField(term523, term523.getClass(), "iLinks", term533);
        term537 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term538 = (char[]) newCharArray(9);
        Object term554 = newInstance(Class.forName("java.lang.Object"));
        char[] term555 = (char[]) newCharArray(0);
        setField(term537, term537.getClass(), "in", null);
        setCharElement(term538, 0, 'A');
        setCharElement(term538, 1, 'E');
        setCharElement(term538, 2, 'B');
        setCharElement(term538, 3, 't');
        setCharElement(term538, 4, 'n');
        setCharElement(term538, 5, 'Z');
        setCharElement(term538, 6, 't');
        setCharElement(term538, 7, 'T');
        setCharElement(term538, 8, 'D');
        setField(term537, term537.getClass(), "cb", term538);
        setIntField(term537, term537.getClass(), "nChars", -616727354);
        setIntField(term537, term537.getClass(), "nextChar", -1955890973);
        setIntField(term537, term537.getClass(), "markedChar", -2038273078);
        setIntField(term537, term537.getClass(), "readAheadLimit", 1227103734);
        setBooleanField(term537, term537.getClass(), "skipLF", false);
        setBooleanField(term537, term537.getClass(), "markedSkipLF", false);
        setField(term537, term537.getClass(), "lock", term554);
        setField(term537, term537.getClass(), "skipBuffer", term555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        Object[] args = new Object[1];
        args[0] = term537;
        try {
            callMethod(klass, "parseDataFile", argTypes, term523, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


