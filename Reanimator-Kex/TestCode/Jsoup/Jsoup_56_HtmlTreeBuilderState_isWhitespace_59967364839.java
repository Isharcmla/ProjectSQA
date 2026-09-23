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

public class HtmlTreeBuilderState_isWhitespace_59967364839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33880;
     Object term33889;

    public HtmlTreeBuilderState_isWhitespace_59967364839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33880 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        term33889 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term33889, term33889.getClass(), "tagName", null);
        setField(term33889, term33889.getClass(), "normalName", null);
        setField(term33889, term33889.getClass(), "pendingAttributeName", null);
        setField(term33889, term33889.getClass(), "pendingAttributeValue", null);
        setField(term33889, term33889.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term33889, term33889.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term33889, term33889.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term33889, term33889.getClass(), "selfClosing", false);
        setField(term33889, term33889.getClass(), "attributes", null);
        setField(term33889, term33889.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term33880;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term33880, term33889));
    }

};


