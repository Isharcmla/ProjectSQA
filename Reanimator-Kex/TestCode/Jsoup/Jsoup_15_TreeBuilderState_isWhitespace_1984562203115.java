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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class TreeBuilderState_isWhitespace_1984562203115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238126;
     Object term238133;

    public TreeBuilderState_isWhitespace_1984562203115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238126 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        term238133 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term238133, term238133.getClass(), "tagName", null);
        setField(term238133, term238133.getClass(), "pendingAttributeName", null);
        setField(term238133, term238133.getClass(), "pendingAttributeValue", null);
        setBooleanField(term238133, term238133.getClass(), "selfClosing", false);
        setField(term238133, term238133.getClass(), "attributes", null);
        setField(term238133, term238133.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term238126;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term238126, term238133));
        assertTrue(recursiveEquals(retValue, false));
    }

};


