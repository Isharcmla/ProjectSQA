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

public class Element_select_2024628612279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79725;

    public Element_select_2024628612279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79989 = newInstance(Class.forName("org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling"));
        ArrayList term79861 = new ArrayList();
        ((ArrayList) term79861).add(term79989);
        ((ArrayList) term79861).add("");
        ((ArrayList) term79861).add("");
        ((ArrayList) term79861).add("");
        term79725 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term79771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term79771, term79771.getClass(), "tagName", "");
        setField(term79725, term79725.getClass(), "tag", term79771);
        setField(term79725, term79725.getClass(), "childNodes", term79861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "select", argTypes, term79725, args);
    }

};


