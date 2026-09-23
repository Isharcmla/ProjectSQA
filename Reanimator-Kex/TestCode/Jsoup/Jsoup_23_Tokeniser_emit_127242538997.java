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

public class Tokeniser_emit_127242538997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100495;
     Object term100563;
     Object term100608;
     Object term100610;

    public Tokeniser_emit_127242538997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100495 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term100495, term100495.getClass(), "isEmitPending", false);
        setField(term100495, term100495.getClass(), "emitPending", null);
        term100563 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term100608 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term100609 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term100608, term100608.getClass(), "reader", null);
        setField(term100608, term100608.getClass(), "errors", null);
        setField(term100608, term100608.getClass(), "state", null);
        setField(term100609, term100609.getClass(), "tagName", null);
        setField(term100609, term100609.getClass(), "pendingAttributeName", null);
        setField(term100609, term100609.getClass(), "pendingAttributeValue", null);
        setBooleanField(term100609, term100609.getClass(), "selfClosing", false);
        setField(term100609, term100609.getClass(), "attributes", null);
        setField(term100609, term100609.getClass(), "type", null);
        setField(term100608, term100608.getClass(), "emitPending", term100609);
        setBooleanField(term100608, term100608.getClass(), "isEmitPending", true);
        setField(term100608, term100608.getClass(), "charBuffer", null);
        setField(term100608, term100608.getClass(), "dataBuffer", null);
        setField(term100608, term100608.getClass(), "tagPending", null);
        setField(term100608, term100608.getClass(), "doctypePending", null);
        setField(term100608, term100608.getClass(), "commentPending", null);
        setField(term100608, term100608.getClass(), "lastStartTag", null);
        setBooleanField(term100608, term100608.getClass(), "selfClosingFlagAcknowledged", false);
        term100610 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term100610, term100610.getClass(), "tagName", null);
        setField(term100610, term100610.getClass(), "pendingAttributeName", null);
        setField(term100610, term100610.getClass(), "pendingAttributeValue", null);
        setBooleanField(term100610, term100610.getClass(), "selfClosing", false);
        setField(term100610, term100610.getClass(), "attributes", null);
        setField(term100610, term100610.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term100563;
        callMethod(klass, "emit", argTypes, term100495, args);
        assertTrue(recursiveEquals(term100495, term100608));
        assertTrue(recursiveEquals(term100563, term100610));
    }

};


