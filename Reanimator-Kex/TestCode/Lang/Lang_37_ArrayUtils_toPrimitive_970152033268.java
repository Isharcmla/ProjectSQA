package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;

public class ArrayUtils_toPrimitive_970152033268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term1119;
     Object term14072;
     Object term14042;

    public ArrayUtils_toPrimitive_970152033268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1101 = new Character('S');
        Character term1103 = new Character('S');
        Character term1105 = new Character('b');
        Character term1107 = new Character('S');
        Character term1109 = new Character('z');
        Character term1111 = new Character('j');
        Character term1113 = new Character('V');
        Character term1115 = new Character('p');
        Character term1117 = new Character('O');
        term1100 = (Object[]) newArray("java.lang.Character", 9);
        setElement(term1100, 0, term1101);
        setElement(term1100, 1, term1103);
        setElement(term1100, 2, term1105);
        setElement(term1100, 3, term1107);
        setElement(term1100, 4, term1109);
        setElement(term1100, 5, term1111);
        setElement(term1100, 6, term1113);
        setElement(term1100, 7, term1115);
        setElement(term1100, 8, term1117);
        term1119 = new Character('Q');
        Character term14073 = new Character('S');
        Character term14074 = new Character('S');
        Character term14075 = new Character('b');
        Character term14076 = new Character('S');
        Character term14077 = new Character('z');
        Character term14078 = new Character('j');
        Character term14079 = new Character('V');
        Character term14080 = new Character('p');
        Character term14081 = new Character('O');
        term14072 = (Object[]) newArray("java.lang.Character", 9);
        setElement(term14072, 0, term14073);
        setElement(term14072, 1, term14074);
        setElement(term14072, 2, term14075);
        setElement(term14072, 3, term14076);
        setElement(term14072, 4, term14077);
        setElement(term14072, 5, term14078);
        setElement(term14072, 6, term14079);
        setElement(term14072, 7, term14080);
        setElement(term14072, 8, term14081);
        term14042 = (char[]) newCharArray(9);
        setCharElement(term14042, 0, 'S');
        setCharElement(term14042, 1, 'S');
        setCharElement(term14042, 2, 'b');
        setCharElement(term14042, 3, 'S');
        setCharElement(term14042, 4, 'z');
        setCharElement(term14042, 5, 'j');
        setCharElement(term14042, 6, 'V');
        setCharElement(term14042, 7, 'p');
        setCharElement(term14042, 8, 'O');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Character"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1100;
        args[1] = term1119;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1100, term14072));
        assertTrue(recursiveEquals(term1119, 'Q'));
        assertTrue(recursiveEquals(retValue, term14042));
    }

};


