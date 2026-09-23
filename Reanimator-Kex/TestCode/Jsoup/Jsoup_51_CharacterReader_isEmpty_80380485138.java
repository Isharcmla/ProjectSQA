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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_isEmpty_80380485138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;
     Object term4567;

    public CharacterReader_isEmpty_80380485138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term128 = (char[]) newCharArray(3);
        Object[] term135 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term128, 0, 'n');
        setCharElement(term128, 1, 'Z');
        setCharElement(term128, 2, 't');
        setField(term127, term127.getClass(), "input", term128);
        setIntField(term127, term127.getClass(), "length", 391863371);
        setIntField(term127, term127.getClass(), "pos", -1922583790);
        setIntField(term127, term127.getClass(), "mark", -616727354);
        setElement(term135, 0, "EGtDIRbSSb");
        setElement(term135, 1, "SzjVpOQTyS");
        setElement(term135, 2, "MjGYSRKTNF");
        setElement(term135, 3, "hRNSzYYIrc");
        setField(term127, term127.getClass(), "stringCache", term135);
        term4567 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4568 = (char[]) newCharArray(3);
        Object[] term4569 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term4568, 0, 'n');
        setCharElement(term4568, 1, 'Z');
        setCharElement(term4568, 2, 't');
        setField(term4567, term4567.getClass(), "input", term4568);
        setIntField(term4567, term4567.getClass(), "length", 391863371);
        setIntField(term4567, term4567.getClass(), "pos", -1922583790);
        setIntField(term4567, term4567.getClass(), "mark", -616727354);
        setElement(term4569, 0, "EGtDIRbSSb");
        setElement(term4569, 1, "SzjVpOQTyS");
        setElement(term4569, 2, "MjGYSRKTNF");
        setElement(term4569, 3, "hRNSzYYIrc");
        setField(term4567, term4567.getClass(), "stringCache", term4569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term127, args);
        assertTrue(recursiveEquals(term127, term4567));
        assertTrue(recursiveEquals(retValue, false));
    }

};


