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
import java.util.ArrayList;

public class Element_getElementsContainingText_2847184189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45436;

    public Element_getElementsContainingText_2847184189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45572 = new ArrayList();
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        ((ArrayList) term45572).add((Object)null);
        term45436 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term45482 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45482, term45482.getClass(), "tagName", "                                                                                                                                                                                                                                            ");
        setField(term45436, term45436.getClass(), "tag", term45482);
        setField(term45436, term45436.getClass(), "childNodes", term45572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "getElementsContainingText", argTypes, term45436, args);
    }

};


