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

public class XmlTreeBuilder_insertNode_215006970625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460290;
     Object term460450;

    public XmlTreeBuilder_insertNode_215006970625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term460396 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term460342 = new ArrayList();
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add((Object)null);
        ((ArrayList) term460342).add(term460396);
        term460290 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term460290, term460290.getClass(), "stack", term460342);
        ArrayList term460556 = new ArrayList();
        term460450 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        Object term460504 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term460504, term460504.getClass(), "childNodes", term460556);
        setField(term460450, term460450.getClass(), "parentNode", term460504);
        setIntField(term460450, term460450.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term460450;
        try {
            callMethod(klass, "insertNode", argTypes, term460290, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


