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

public class Element_select_2024628612227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55777;

    public Element_select_2024628612227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55913 = new ArrayList();
        ((ArrayList) term55913).add("");
        ((ArrayList) term55913).add("");
        ((ArrayList) term55913).add("");
        ((ArrayList) term55913).add("");
        ((ArrayList) term55913).add("");
        term55777 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55823, term55823.getClass(), "tagName", "");
        setField(term55777, term55777.getClass(), "tag", term55823);
        setField(term55777, term55777.getClass(), "childNodes", term55913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "select", argTypes, term55777, args);
    }

};


