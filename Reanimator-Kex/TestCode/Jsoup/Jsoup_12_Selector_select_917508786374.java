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

public class Selector_select_917508786374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345001;
     Object term346011;
     Object term345996;

    public Selector_select_917508786374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term345492 = new LinkedHashMap();
        term345001 = ((LinkedHashMap) term345492).values();
        LinkedHashMap term346012 = new LinkedHashMap();
        term346011 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term346011, term346011.getClass(), "this$0", term346012);
        ArrayList term345997 = new ArrayList();
        term345996 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term345996, term345996.getClass(), "contents", term345997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        args[1] = term345001;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term345001, term346011));
        assertTrue(recursiveEquals(retValue, term345996));
    }

};


