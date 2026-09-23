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
import java.lang.Object;

public class Tokeniser_emitTagPending_85225482663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81271;
     Object term81389;

    public Tokeniser_emitTagPending_85225482663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81271 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term81339 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term81271, term81271.getClass(), "tagPending", term81339);
        term81389 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term81390 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term81389, term81389.getClass(), "reader", null);
        setField(term81389, term81389.getClass(), "errors", null);
        setField(term81389, term81389.getClass(), "state", null);
        setField(term81390, term81390.getClass(), "tagName", null);
        setField(term81390, term81390.getClass(), "pendingAttributeName", null);
        setField(term81390, term81390.getClass(), "pendingAttributeValue", null);
        setBooleanField(term81390, term81390.getClass(), "selfClosing", false);
        setField(term81390, term81390.getClass(), "attributes", null);
        setField(term81390, term81390.getClass(), "type", null);
        setField(term81389, term81389.getClass(), "emitPending", term81390);
        setBooleanField(term81389, term81389.getClass(), "isEmitPending", true);
        setField(term81389, term81389.getClass(), "charBuffer", null);
        setField(term81389, term81389.getClass(), "dataBuffer", null);
        setField(term81389, term81389.getClass(), "tagPending", term81390);
        setField(term81389, term81389.getClass(), "doctypePending", null);
        setField(term81389, term81389.getClass(), "commentPending", null);
        setField(term81389, term81389.getClass(), "lastStartTag", null);
        setBooleanField(term81389, term81389.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term81271, args);
        assertTrue(recursiveEquals(term81271, term81389));
    }

};


