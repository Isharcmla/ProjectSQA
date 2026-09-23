package org.jsoup.parser;

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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_aboveOnStack_665381070271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460486;

    public HtmlTreeBuilder_aboveOnStack_665381070271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term460576 = newInstance(Class.forName("java.lang.Object"));
        Object term460630 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term460682 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term460742 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term460794 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term460846 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term460898 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term460538 = new ArrayList();
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460576);
        ((ArrayList) term460538).add(term460630);
        ((ArrayList) term460538).add(term460682);
        ((ArrayList) term460538).add(term460682);
        ((ArrayList) term460538).add(term460742);
        ((ArrayList) term460538).add(term460794);
        ((ArrayList) term460538).add(term460846);
        ((ArrayList) term460538).add(term460898);
        term460486 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term460486, term460486.getClass(), "stack", term460538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "aboveOnStack", argTypes, term460486, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


