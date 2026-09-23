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
import java.lang.StringBuilder;
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266717;
     Object term270978;

    public Tokeniser_emitTagPending_852254826271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term264663 = (char[]) newCharArray(489);
        StringBuilder term266937 = new StringBuilder();
        ((StringBuilder) term266937).append(term264663);
        term266717 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term266781 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term266877 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term266781, term266781.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term266781, term266781.getClass(), "attributes", term266877);
        setField(term266781, term266781.getClass(), "pendingAttributeValue", term266937);
        setField(term266717, term266717.getClass(), "tagPending", term266781);
        LinkedHashMap term270983 = new LinkedHashMap();
        term270978 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term270979 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term270980 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term270981 = (byte[]) newByteArray(489);
        Object term270982 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term270978, term270978.getClass(), "reader", null);
        setField(term270978, term270978.getClass(), "errors", null);
        setField(term270978, term270978.getClass(), "state", null);
        setField(term270979, term270979.getClass(), "tagName", null);
        setField(term270979, term270979.getClass(), "pendingAttributeName", null);
        setField(term270980, term270980.getClass(), "value", term270981);
        setByteField(term270980, term270980.getClass(), "coder", (byte) 0);
        setIntField(term270980, term270980.getClass(), "count", 0);
        setField(term270979, term270979.getClass(), "pendingAttributeValue", term270980);
        setBooleanField(term270979, term270979.getClass(), "selfClosing", false);
        setField(term270982, term270982.getClass(), "attributes", term270983);
        setField(term270979, term270979.getClass(), "attributes", term270982);
        setField(term270979, term270979.getClass(), "type", null);
        setField(term270978, term270978.getClass(), "emitPending", term270979);
        setBooleanField(term270978, term270978.getClass(), "isEmitPending", true);
        setField(term270978, term270978.getClass(), "charBuffer", null);
        setField(term270978, term270978.getClass(), "dataBuffer", null);
        setField(term270978, term270978.getClass(), "tagPending", term270979);
        setField(term270978, term270978.getClass(), "doctypePending", null);
        setField(term270978, term270978.getClass(), "commentPending", null);
        setField(term270978, term270978.getClass(), "lastStartTag", null);
        setBooleanField(term270978, term270978.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term266717, args);
        assertTrue(recursiveEquals(term266717, term270978));
    }

};


