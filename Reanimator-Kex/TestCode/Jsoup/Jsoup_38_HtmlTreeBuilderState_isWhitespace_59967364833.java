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

public class HtmlTreeBuilderState_isWhitespace_59967364833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48515;
     Object term48522;

    public HtmlTreeBuilderState_isWhitespace_59967364833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48515 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        term48522 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term48522, term48522.getClass(), "tagName", null);
        setField(term48522, term48522.getClass(), "pendingAttributeName", null);
        setField(term48522, term48522.getClass(), "pendingAttributeValue", null);
        setBooleanField(term48522, term48522.getClass(), "selfClosing", false);
        setField(term48522, term48522.getClass(), "attributes", null);
        setField(term48522, term48522.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term48515;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term48515, term48522));
        assertTrue(recursiveEquals(retValue, false));
    }

};


