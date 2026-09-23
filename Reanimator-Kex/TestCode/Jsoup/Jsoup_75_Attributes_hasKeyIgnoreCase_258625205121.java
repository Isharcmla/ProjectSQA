package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_hasKeyIgnoreCase_258625205121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67758;
     Object term68025;

    public Attributes_hasKeyIgnoreCase_258625205121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67758 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term67686 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term67758, term67758.getClass(), "size", 1);
        setField(term67758, term67758.getClass(), "keys", term67686);
        term68025 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term68026 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term68025, term68025.getClass(), "size", 1);
        setField(term68025, term68025.getClass(), "keys", term68026);
        setField(term68025, term68025.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasKeyIgnoreCase", argTypes, term67758, args);
        assertTrue(recursiveEquals(term67758, term68025));
        assertTrue(recursiveEquals(retValue, false));
    }

};


