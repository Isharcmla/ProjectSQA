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

public class StringUtils_join_1501148232249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1773;
     Object term1780;
     Object term1782;
     Object term1784;
     Object term10759;

    public StringUtils_join_1501148232249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1773 = (Object[]) newArray("java.lang.Object", 6);
        Object term1774 = newInstance(Class.forName("java.lang.Object"));
        Object term1775 = newInstance(Class.forName("java.lang.Object"));
        Object term1776 = newInstance(Class.forName("java.lang.Object"));
        Object term1777 = newInstance(Class.forName("java.lang.Object"));
        Object term1778 = newInstance(Class.forName("java.lang.Object"));
        Object term1779 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1773, 0, term1774);
        setElement(term1773, 1, term1775);
        setElement(term1773, 2, term1776);
        setElement(term1773, 3, term1777);
        setElement(term1773, 4, term1778);
        setElement(term1773, 5, term1779);
        term1780 = new Character('M');
        term1782 = new Integer(865208305);
        term1784 = new Integer(-1275173084);
        term10759 = (Object[]) newArray("java.lang.Object", 6);
        Object term10760 = newInstance(Class.forName("java.lang.Object"));
        Object term10761 = newInstance(Class.forName("java.lang.Object"));
        Object term10762 = newInstance(Class.forName("java.lang.Object"));
        Object term10763 = newInstance(Class.forName("java.lang.Object"));
        Object term10764 = newInstance(Class.forName("java.lang.Object"));
        Object term10765 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10759, 0, term10760);
        setElement(term10759, 1, term10761);
        setElement(term10759, 2, term10762);
        setElement(term10759, 3, term10763);
        setElement(term10759, 4, term10764);
        setElement(term10759, 5, term10765);
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
        args[0] = term1773;
        args[1] = term1780;
        args[2] = term1782;
        args[3] = term1784;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1773, term10759));
        assertTrue(recursiveEquals(term1780, 'M'));
        assertTrue(recursiveEquals(term1782, 865208305));
        assertTrue(recursiveEquals(term1784, -1275173084));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


