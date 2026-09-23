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
import java.util.LinkedHashMap;

public class Attributes_removeIgnoreCase_1226208024137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025008;
     Object term3025228;

    public Attributes_removeIgnoreCase_1226208024137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3025068 = new LinkedHashMap();
        ((LinkedHashMap) term3025068).put("", "");
        term3025008 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3025008, term3025008.getClass(), "attributes", term3025068);
        LinkedHashMap term3025229 = new LinkedHashMap();
        term3025228 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3025228, term3025228.getClass(), "attributes", term3025229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "    ";
        callMethod(klass, "removeIgnoreCase", argTypes, term3025008, args);
        assertTrue(recursiveEquals(term3025008, term3025228));
    }

};


