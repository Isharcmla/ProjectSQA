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

public class Tokeniser_emitTagPending_852254826225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188969;
     Object term190305;

    public Tokeniser_emitTagPending_852254826225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188969 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term189037 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term189171 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term189037, term189037.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term189037, term189037.getClass(), "pendingAttributeValue", "");
        setField(term189037, term189037.getClass(), "attributes", term189171);
        setField(term188969, term188969.getClass(), "tagPending", term189037);
        LinkedHashMap term190308 = new LinkedHashMap();
        term190305 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term190306 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term190307 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term190305, term190305.getClass(), "reader", null);
        setField(term190305, term190305.getClass(), "errors", null);
        setField(term190305, term190305.getClass(), "state", null);
        setField(term190306, term190306.getClass(), "tagName", null);
        setField(term190306, term190306.getClass(), "pendingAttributeName", null);
        setField(term190306, term190306.getClass(), "pendingAttributeValue", null);
        setBooleanField(term190306, term190306.getClass(), "selfClosing", false);
        setField(term190307, term190307.getClass(), "attributes", term190308);
        setField(term190306, term190306.getClass(), "attributes", term190307);
        setField(term190306, term190306.getClass(), "type", null);
        setField(term190305, term190305.getClass(), "emitPending", term190306);
        setBooleanField(term190305, term190305.getClass(), "isEmitPending", true);
        setField(term190305, term190305.getClass(), "charBuffer", null);
        setField(term190305, term190305.getClass(), "dataBuffer", null);
        setField(term190305, term190305.getClass(), "tagPending", term190306);
        setField(term190305, term190305.getClass(), "doctypePending", null);
        setField(term190305, term190305.getClass(), "commentPending", null);
        setField(term190305, term190305.getClass(), "lastStartTag", null);
        setBooleanField(term190305, term190305.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term188969, args);
        assertTrue(recursiveEquals(term188969, term190305));
    }

};


