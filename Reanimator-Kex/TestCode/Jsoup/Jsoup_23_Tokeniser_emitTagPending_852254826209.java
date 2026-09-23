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

public class Tokeniser_emitTagPending_852254826209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171512;
     Object term172760;

    public Tokeniser_emitTagPending_852254826209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171512 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term171576 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term171672 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term171576, term171576.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term171576, term171576.getClass(), "pendingAttributeValue", null);
        setField(term171576, term171576.getClass(), "attributes", term171672);
        setField(term171512, term171512.getClass(), "tagPending", term171576);
        LinkedHashMap term172763 = new LinkedHashMap();
        term172760 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term172761 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term172762 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term172760, term172760.getClass(), "reader", null);
        setField(term172760, term172760.getClass(), "errors", null);
        setField(term172760, term172760.getClass(), "state", null);
        setField(term172761, term172761.getClass(), "tagName", null);
        setField(term172761, term172761.getClass(), "pendingAttributeName", null);
        setField(term172761, term172761.getClass(), "pendingAttributeValue", null);
        setBooleanField(term172761, term172761.getClass(), "selfClosing", false);
        setField(term172762, term172762.getClass(), "attributes", term172763);
        setField(term172761, term172761.getClass(), "attributes", term172762);
        setField(term172761, term172761.getClass(), "type", null);
        setField(term172760, term172760.getClass(), "emitPending", term172761);
        setBooleanField(term172760, term172760.getClass(), "isEmitPending", true);
        setField(term172760, term172760.getClass(), "charBuffer", null);
        setField(term172760, term172760.getClass(), "dataBuffer", null);
        setField(term172760, term172760.getClass(), "tagPending", term172761);
        setField(term172760, term172760.getClass(), "doctypePending", null);
        setField(term172760, term172760.getClass(), "commentPending", null);
        setField(term172760, term172760.getClass(), "lastStartTag", null);
        setBooleanField(term172760, term172760.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term171512, args);
        assertTrue(recursiveEquals(term171512, term172760));
    }

};


