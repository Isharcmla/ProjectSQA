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
import java.lang.Object;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueEnding_604542315275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87711;

    public Element_getElementsByAttributeValueEnding_604542315275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term87829 = new LinkedHashMap();
        ((LinkedHashMap) term87829).put("", "");
        term87711 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term87769 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term87769, term87769.getClass(), "attributes", term87829);
        setField(term87711, term87711.getClass(), "attributes", term87769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                            ";
        args[1] = "                ";
        callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term87711, args);
    }

};


