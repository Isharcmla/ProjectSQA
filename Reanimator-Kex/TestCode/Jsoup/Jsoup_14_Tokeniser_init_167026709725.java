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
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_init_167026709725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term67533;
     Object term67544;

    public Tokeniser_init_167026709725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1, term1.getClass(), "input", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "length", 568599855);
        setIntField(term1, term1.getClass(), "pos", 1162663216);
        setIntField(term1, term1.getClass(), "mark", 1484323161);
        ArrayList term67537 = new ArrayList();
        Class<? extends Object> term67568 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term67567 = ((Class) term67568).getDeclaredField((String) "Data");
        ((Field) term67567).setAccessible(true);
        Object enum274 = ((Field) term67567).get((Object) null);
        term67533 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term67534 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term67542 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term67543 = (byte[]) newByteArray(16);
        setField(term67534, term67534.getClass(), "input", "PAEBtnZtTD");
        setIntField(term67534, term67534.getClass(), "length", 568599855);
        setIntField(term67534, term67534.getClass(), "pos", 1162663216);
        setIntField(term67534, term67534.getClass(), "mark", 1484323161);
        setField(term67533, term67533.getClass(), "reader", term67534);
        setBooleanField(term67533, term67533.getClass(), "trackErrors", true);
        setField(term67533, term67533.getClass(), "errors", term67537);
        setField(term67533, term67533.getClass(), "state", enum274);
        setField(term67533, term67533.getClass(), "emitPending", null);
        setBooleanField(term67533, term67533.getClass(), "isEmitPending", false);
        setField(term67542, term67542.getClass(), "value", term67543);
        setByteField(term67542, term67542.getClass(), "coder", (byte) 0);
        setIntField(term67542, term67542.getClass(), "count", 0);
        setField(term67533, term67533.getClass(), "charBuffer", term67542);
        setField(term67533, term67533.getClass(), "dataBuffer", null);
        setField(term67533, term67533.getClass(), "tagPending", null);
        setField(term67533, term67533.getClass(), "doctypePending", null);
        setField(term67533, term67533.getClass(), "commentPending", null);
        setField(term67533, term67533.getClass(), "lastStartTag", null);
        setBooleanField(term67533, term67533.getClass(), "selfClosingFlagAcknowledged", true);
        term67544 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term67544, term67544.getClass(), "input", "PAEBtnZtTD");
        setIntField(term67544, term67544.getClass(), "length", 568599855);
        setIntField(term67544, term67544.getClass(), "pos", 1162663216);
        setIntField(term67544, term67544.getClass(), "mark", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.CharacterReader");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term67533));
        assertTrue(recursiveEquals(term1, term67544));
    }

};


