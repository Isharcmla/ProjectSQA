package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Selector_select_917508786428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372339;
     Object term384475;
     Object term384460;

    public Selector_select_917508786428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term372399 = new LinkedHashMap();
        term372339 = ((LinkedHashMap) term372399).values();
        LinkedHashMap term384476 = new LinkedHashMap();
        term384475 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term384475, term384475.getClass(), "this$0", term384476);
        ArrayList term384461 = new ArrayList();
        term384460 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term384460, term384460.getClass(), "contents", term384461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = term372339;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term372339, term384475));
        assertTrue(recursiveEquals(retValue, term384460));
    }

};


