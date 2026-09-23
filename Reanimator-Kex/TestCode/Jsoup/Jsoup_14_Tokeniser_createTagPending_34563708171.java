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
import java.lang.String;

public class Tokeniser_createTagPending_34563708171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183686;
     Object term183724;
     Object term183704;

    public Tokeniser_createTagPending_34563708171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183686 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Class<? extends Object> term183731 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term183730 = ((Class) term183731).getDeclaredField((String) "StartTag");
        ((Field) term183730).setAccessible(true);
        Object enum752 = ((Field) term183730).get((Object) null);
        term183724 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term183725 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term183726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term183724, term183724.getClass(), "reader", null);
        setBooleanField(term183724, term183724.getClass(), "trackErrors", false);
        setField(term183724, term183724.getClass(), "errors", null);
        setField(term183724, term183724.getClass(), "state", null);
        setField(term183724, term183724.getClass(), "emitPending", null);
        setBooleanField(term183724, term183724.getClass(), "isEmitPending", false);
        setField(term183724, term183724.getClass(), "charBuffer", null);
        setField(term183724, term183724.getClass(), "dataBuffer", null);
        setField(term183725, term183725.getClass(), "tagName", null);
        setField(term183725, term183725.getClass(), "pendingAttributeName", null);
        setField(term183725, term183725.getClass(), "pendingAttributeValue", null);
        setBooleanField(term183725, term183725.getClass(), "selfClosing", false);
        setField(term183726, term183726.getClass(), "attributes", null);
        setField(term183725, term183725.getClass(), "attributes", term183726);
        setField(term183725, term183725.getClass(), "type", enum752);
        setField(term183724, term183724.getClass(), "tagPending", term183725);
        setField(term183724, term183724.getClass(), "doctypePending", null);
        setField(term183724, term183724.getClass(), "commentPending", null);
        setField(term183724, term183724.getClass(), "lastStartTag", null);
        setBooleanField(term183724, term183724.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term183922 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term183921 = ((Class) term183922).getDeclaredField((String) "StartTag");
        ((Field) term183921).setAccessible(true);
        Object enum753 = ((Field) term183921).get((Object) null);
        term183704 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term183706 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term183704, term183704.getClass(), "tagName", null);
        setField(term183704, term183704.getClass(), "pendingAttributeName", null);
        setField(term183704, term183704.getClass(), "pendingAttributeValue", null);
        setBooleanField(term183704, term183704.getClass(), "selfClosing", false);
        setField(term183706, term183706.getClass(), "attributes", null);
        setField(term183704, term183704.getClass(), "attributes", term183706);
        setField(term183704, term183704.getClass(), "type", enum753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term183686, args);
        assertTrue(recursiveEquals(term183686, term183724));
        assertTrue(recursiveEquals(retValue, term183704));
    }

};


