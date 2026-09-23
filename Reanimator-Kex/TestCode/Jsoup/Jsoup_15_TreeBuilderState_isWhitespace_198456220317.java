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

public class TreeBuilderState_isWhitespace_198456220317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40741;
     Object term40748;

    public TreeBuilderState_isWhitespace_198456220317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40741 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term40748 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term40748, term40748.getClass(), "tagName", null);
        setField(term40748, term40748.getClass(), "pendingAttributeName", null);
        setField(term40748, term40748.getClass(), "pendingAttributeValue", null);
        setBooleanField(term40748, term40748.getClass(), "selfClosing", false);
        setField(term40748, term40748.getClass(), "attributes", null);
        setField(term40748, term40748.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term40741;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term40741, term40748));
        assertTrue(recursiveEquals(retValue, false));
    }

};


