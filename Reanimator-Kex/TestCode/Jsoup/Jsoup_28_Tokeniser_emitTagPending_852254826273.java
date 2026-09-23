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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272788;
     Object term273577;

    public Tokeniser_emitTagPending_852254826273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272788 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term272852 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term272948 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term272852, term272852.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                ");
        setField(term272852, term272852.getClass(), "attributes", term272948);
        setField(term272852, term272852.getClass(), "pendingAttributeValue", null);
        setField(term272788, term272788.getClass(), "tagPending", term272852);
        LinkedHashMap term273580 = new LinkedHashMap();
        term273577 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term273578 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term273579 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term273577, term273577.getClass(), "reader", null);
        setField(term273577, term273577.getClass(), "errors", null);
        setField(term273577, term273577.getClass(), "state", null);
        setField(term273578, term273578.getClass(), "tagName", null);
        setField(term273578, term273578.getClass(), "pendingAttributeName", null);
        setField(term273578, term273578.getClass(), "pendingAttributeValue", null);
        setBooleanField(term273578, term273578.getClass(), "selfClosing", false);
        setField(term273579, term273579.getClass(), "attributes", term273580);
        setField(term273578, term273578.getClass(), "attributes", term273579);
        setField(term273578, term273578.getClass(), "type", null);
        setField(term273577, term273577.getClass(), "emitPending", term273578);
        setBooleanField(term273577, term273577.getClass(), "isEmitPending", true);
        setField(term273577, term273577.getClass(), "charBuffer", null);
        setField(term273577, term273577.getClass(), "dataBuffer", null);
        setField(term273577, term273577.getClass(), "tagPending", term273578);
        setField(term273577, term273577.getClass(), "doctypePending", null);
        setField(term273577, term273577.getClass(), "commentPending", null);
        setField(term273577, term273577.getClass(), "lastStartTag", null);
        setBooleanField(term273577, term273577.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term272788, args);
        assertTrue(recursiveEquals(term272788, term273577));
    }

};


