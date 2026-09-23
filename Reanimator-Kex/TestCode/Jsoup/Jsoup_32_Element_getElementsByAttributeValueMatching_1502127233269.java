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
import java.util.ArrayList;

public class Element_getElementsByAttributeValueMatching_1502127233269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71119;

    public Element_getElementsByAttributeValueMatching_1502127233269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term71237 = new LinkedHashMap();
        Object[] term70938 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term71393 = new ArrayList();
        ((ArrayList) term71393).add((Object)term70938);
        term71119 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term71177 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term71177, term71177.getClass(), "attributes", term71237);
        setField(term71119, term71119.getClass(), "attributes", term71177);
        setField(term71119, term71119.getClass(), "childNodes", term71393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "          ";
        callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term71119, args);
    }

};


