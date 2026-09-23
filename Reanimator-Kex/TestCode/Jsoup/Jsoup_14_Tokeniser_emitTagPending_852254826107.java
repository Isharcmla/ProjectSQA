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

public class Tokeniser_emitTagPending_852254826107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206354;
     Object term206603;

    public Tokeniser_emitTagPending_852254826107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206354 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term206418 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term206354, term206354.getClass(), "tagPending", term206418);
        term206603 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term206604 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term206603, term206603.getClass(), "reader", null);
        setBooleanField(term206603, term206603.getClass(), "trackErrors", false);
        setField(term206603, term206603.getClass(), "errors", null);
        setField(term206603, term206603.getClass(), "state", null);
        setField(term206604, term206604.getClass(), "tagName", null);
        setField(term206604, term206604.getClass(), "pendingAttributeName", null);
        setField(term206604, term206604.getClass(), "pendingAttributeValue", null);
        setBooleanField(term206604, term206604.getClass(), "selfClosing", false);
        setField(term206604, term206604.getClass(), "attributes", null);
        setField(term206604, term206604.getClass(), "type", null);
        setField(term206603, term206603.getClass(), "emitPending", term206604);
        setBooleanField(term206603, term206603.getClass(), "isEmitPending", true);
        setField(term206603, term206603.getClass(), "charBuffer", null);
        setField(term206603, term206603.getClass(), "dataBuffer", null);
        setField(term206603, term206603.getClass(), "tagPending", term206604);
        setField(term206603, term206603.getClass(), "doctypePending", null);
        setField(term206603, term206603.getClass(), "commentPending", null);
        setField(term206603, term206603.getClass(), "lastStartTag", null);
        setBooleanField(term206603, term206603.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term206354, args);
        assertTrue(recursiveEquals(term206354, term206603));
    }

};


