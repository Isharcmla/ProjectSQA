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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200152;
     Object term200713;

    public Tokeniser_emitTagPending_852254826221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200723 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200722 = ((Class) term200723).getDeclaredField((String) "StartTag");
        ((Field) term200722).setAccessible(true);
        Object enum364 = ((Field) term200722).get((Object) null);
        term200152 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term200220 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term200220, term200220.getClass(), "pendingAttributeName", " ");
        setField(term200220, term200220.getClass(), "attributes", null);
        setField(term200220, term200220.getClass(), "pendingAttributeValue", null);
        setField(term200220, term200220.getClass(), "type", enum364);
        setField(term200152, term200152.getClass(), "tagPending", term200220);
        setBooleanField(term200152, term200152.getClass(), "isEmitPending", false);
        setField(term200152, term200152.getClass(), "emitPending", null);
        LinkedHashMap term200716 = new LinkedHashMap();
        Class<? extends Object> term200914 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200913 = ((Class) term200914).getDeclaredField((String) "StartTag");
        ((Field) term200913).setAccessible(true);
        Object enum365 = ((Field) term200913).get((Object) null);
        term200713 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term200714 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term200715 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term200713, term200713.getClass(), "reader", null);
        setField(term200713, term200713.getClass(), "errors", null);
        setField(term200713, term200713.getClass(), "state", null);
        setField(term200714, term200714.getClass(), "tagName", null);
        setField(term200714, term200714.getClass(), "pendingAttributeName", null);
        setField(term200714, term200714.getClass(), "pendingAttributeValue", null);
        setBooleanField(term200714, term200714.getClass(), "selfClosing", false);
        setField(term200715, term200715.getClass(), "attributes", term200716);
        setField(term200714, term200714.getClass(), "attributes", term200715);
        setField(term200714, term200714.getClass(), "type", enum365);
        setField(term200713, term200713.getClass(), "emitPending", term200714);
        setBooleanField(term200713, term200713.getClass(), "isEmitPending", true);
        setField(term200713, term200713.getClass(), "charBuffer", null);
        setField(term200713, term200713.getClass(), "dataBuffer", null);
        setField(term200713, term200713.getClass(), "tagPending", term200714);
        setField(term200713, term200713.getClass(), "doctypePending", null);
        setField(term200713, term200713.getClass(), "commentPending", null);
        setField(term200713, term200713.getClass(), "lastStartTag", term200714);
        setBooleanField(term200713, term200713.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term200152, args);
        assertTrue(recursiveEquals(term200152, term200713));
    }

};


