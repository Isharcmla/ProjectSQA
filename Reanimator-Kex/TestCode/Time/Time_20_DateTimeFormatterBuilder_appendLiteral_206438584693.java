package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Character;

public class DateTimeFormatterBuilder_appendLiteral_206438584693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term136;
     Object term3716;
     Object term3709;

    public DateTimeFormatterBuilder_appendLiteral_206438584693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term131 = new ArrayList();
        term130 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term135 = newInstance(Class.forName("java.lang.Object"));
        setField(term130, term130.getClass(), "iElementPairs", term131);
        setField(term130, term130.getClass(), "iFormatter", term135);
        term136 = new Character('P');
        Object term3719 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term3719, term3719.getClass(), "iValue", 'P');
        ArrayList term3717 = new ArrayList();
        ((ArrayList) term3717).add(term3719);
        ((ArrayList) term3717).add(term3719);
        term3716 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3716, term3716.getClass(), "iElementPairs", term3717);
        setField(term3716, term3716.getClass(), "iFormatter", null);
        Object term3712 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term3712, term3712.getClass(), "iValue", 'P');
        ArrayList term3710 = new ArrayList();
        ((ArrayList) term3710).add(term3712);
        ((ArrayList) term3710).add(term3712);
        term3709 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3709, term3709.getClass(), "iElementPairs", term3710);
        setField(term3709, term3709.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "appendLiteral", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term3716));
        assertTrue(recursiveEquals(term136, 'P'));
        assertTrue(recursiveEquals(retValue, term3709));
    }

};


