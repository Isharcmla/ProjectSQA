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
import java.lang.Integer;

public class StringUtils_join_1501148232250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1772;
     Object term1779;
     Object term1781;
     Object term1783;
     Object term11390;

    public StringUtils_join_1501148232250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1772 = (Object[]) newArray("java.lang.Object", 6);
        Object term1773 = newInstance(Class.forName("java.lang.Object"));
        Object term1774 = newInstance(Class.forName("java.lang.Object"));
        Object term1775 = newInstance(Class.forName("java.lang.Object"));
        Object term1776 = newInstance(Class.forName("java.lang.Object"));
        Object term1777 = newInstance(Class.forName("java.lang.Object"));
        Object term1778 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1772, 0, term1773);
        setElement(term1772, 1, term1774);
        setElement(term1772, 2, term1775);
        setElement(term1772, 3, term1776);
        setElement(term1772, 4, term1777);
        setElement(term1772, 5, term1778);
        term1779 = new Character('M');
        term1781 = new Integer(865208305);
        term1783 = new Integer(-1275173084);
        term11390 = (Object[]) newArray("java.lang.Object", 6);
        Object term11391 = newInstance(Class.forName("java.lang.Object"));
        Object term11392 = newInstance(Class.forName("java.lang.Object"));
        Object term11393 = newInstance(Class.forName("java.lang.Object"));
        Object term11394 = newInstance(Class.forName("java.lang.Object"));
        Object term11395 = newInstance(Class.forName("java.lang.Object"));
        Object term11396 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11390, 0, term11391);
        setElement(term11390, 1, term11392);
        setElement(term11390, 2, term11393);
        setElement(term11390, 3, term11394);
        setElement(term11390, 4, term11395);
        setElement(term11390, 5, term11396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1772;
        args[1] = term1779;
        args[2] = term1781;
        args[3] = term1783;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1772, term11390));
        assertTrue(recursiveEquals(term1779, 'M'));
        assertTrue(recursiveEquals(term1781, 865208305));
        assertTrue(recursiveEquals(term1783, -1275173084));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


