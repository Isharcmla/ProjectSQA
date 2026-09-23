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
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269304;
     Object term267528;

    public CharacterReader_consumeToAny_1422703610849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269304 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term267532 = (char[]) newCharArray(811);
        Object[] term269155 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term269304, term269304.getClass(), "bufPos", -2147482840);
        setIntField(term269304, term269304.getClass(), "bufSplitPoint", -2147482839);
        setIntField(term269304, term269304.getClass(), "bufLength", -2147482837);
        setCharElement(term267532, -2147482839, (char) 53872);
        setCharElement(term267532, -2147482838, (char) 38775);
        setField(term269304, term269304.getClass(), "charBuf", term267532);
        setField(term269304, term269304.getClass(), "stringCache", term269155);
        term267528 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term267528;
        callMethod(klass, "consumeToAny", argTypes, term269304, args);
    }

};


