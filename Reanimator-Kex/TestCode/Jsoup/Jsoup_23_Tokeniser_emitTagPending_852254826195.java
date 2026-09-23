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

public class Tokeniser_emitTagPending_852254826195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157140;
     Object term157726;

    public Tokeniser_emitTagPending_852254826195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157734 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157733 = ((Class) term157734).getDeclaredField((String) "EndTag");
        ((Field) term157733).setAccessible(true);
        Object enum345 = ((Field) term157733).get((Object) null);
        LinkedHashMap term157430 = new LinkedHashMap();
        term157140 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term157204 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term157370 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term157204, term157204.getClass(), "pendingAttributeName", null);
        setField(term157204, term157204.getClass(), "type", enum345);
        setField(term157370, term157370.getClass(), "attributes", term157430);
        setField(term157204, term157204.getClass(), "attributes", term157370);
        setField(term157140, term157140.getClass(), "tagPending", term157204);
        setBooleanField(term157140, term157140.getClass(), "isEmitPending", false);
        setField(term157140, term157140.getClass(), "emitPending", null);
        LinkedHashMap term157729 = new LinkedHashMap();
        Class<? extends Object> term157919 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157918 = ((Class) term157919).getDeclaredField((String) "EndTag");
        ((Field) term157918).setAccessible(true);
        Object enum346 = ((Field) term157918).get((Object) null);
        term157726 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term157727 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term157728 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term157726, term157726.getClass(), "reader", null);
        setField(term157726, term157726.getClass(), "errors", null);
        setField(term157726, term157726.getClass(), "state", null);
        setField(term157727, term157727.getClass(), "tagName", null);
        setField(term157727, term157727.getClass(), "pendingAttributeName", null);
        setField(term157727, term157727.getClass(), "pendingAttributeValue", null);
        setBooleanField(term157727, term157727.getClass(), "selfClosing", false);
        setField(term157728, term157728.getClass(), "attributes", term157729);
        setField(term157727, term157727.getClass(), "attributes", term157728);
        setField(term157727, term157727.getClass(), "type", enum346);
        setField(term157726, term157726.getClass(), "emitPending", term157727);
        setBooleanField(term157726, term157726.getClass(), "isEmitPending", true);
        setField(term157726, term157726.getClass(), "charBuffer", null);
        setField(term157726, term157726.getClass(), "dataBuffer", null);
        setField(term157726, term157726.getClass(), "tagPending", term157727);
        setField(term157726, term157726.getClass(), "doctypePending", null);
        setField(term157726, term157726.getClass(), "commentPending", null);
        setField(term157726, term157726.getClass(), "lastStartTag", null);
        setBooleanField(term157726, term157726.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term157140, args);
        assertTrue(recursiveEquals(term157140, term157726));
    }

};


