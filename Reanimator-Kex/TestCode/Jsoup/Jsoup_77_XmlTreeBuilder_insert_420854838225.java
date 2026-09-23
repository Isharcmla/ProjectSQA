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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366451;
     Object term366675;

    public XmlTreeBuilder_insert_420854838225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term366541 = newInstance(Class.forName("java.lang.Object"));
        Object term366613 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term366503 = new ArrayList();
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366541);
        ((ArrayList) term366503).add(term366613);
        term366451 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term366451, term366451.getClass(), "stack", term366503);
        term366675 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term366675, term366675.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term366675;
        try {
            callMethod(klass, "insert", argTypes, term366451, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


