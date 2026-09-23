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
import java.lang.IllegalArgumentException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Selector_select_928897875160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135036;

    public Selector_select_928897875160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term135172 = new ArrayList();
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        ((ArrayList) term135172).add("");
        term135036 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term135082 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term135082, term135082.getClass(), "tagName", "");
        setField(term135036, term135036.getClass(), "tag", term135082);
        setField(term135036, term135036.getClass(), "childNodes", term135172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term135036;
        try {
            callMethod(klass, "select", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


