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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423251;
     Object term423413;

    public XmlTreeBuilder_insertNode_215006970549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term423357 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term423303 = new ArrayList();
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add((Object)null);
        ((ArrayList) term423303).add(term423357);
        term423251 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term423251, term423251.getClass(), "stack", term423303);
        ArrayList term423519 = new ArrayList();
        term423413 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        Object term423467 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term423467, term423467.getClass(), "childNodes", term423519);
        setField(term423413, term423413.getClass(), "parentNode", term423467);
        setIntField(term423413, term423413.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term423413;
        try {
            callMethod(klass, "insertNode", argTypes, term423251, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


