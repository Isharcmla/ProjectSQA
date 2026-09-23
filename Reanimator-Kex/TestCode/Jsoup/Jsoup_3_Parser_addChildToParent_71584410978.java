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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_71584410978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48428;
     Object term48624;

    public Parser_addChildToParent_71584410978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term48482 = new LinkedList();
        term48428 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term48428, term48428.getClass(), "stack", term48482);
        setField(term48428, term48428.getClass(), "baseUri", "kex.java.util.HashMap");
        Object term48745 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term48699 = new ArrayList();
        ((ArrayList) term48699).add(term48745);
        term48624 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term48647 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48647, term48647.getClass(), "ancestors", term48699);
        setBooleanField(term48647, term48647.getClass(), "canContainBlock", false);
        setField(term48624, term48624.getClass(), "tag", term48647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term48624;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term48428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


