package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendWhitespaceIfBr_63120937569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6784;
     Object term6849;

    public Element_appendWhitespaceIfBr_63120937569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6808 = new HashMap();
        Set<Object> term6879 =  ((Map) term6808).keySet();
        HashSet term6807 = new HashSet((Collection<? extends Object>) term6879);
        ArrayList term6820 = new ArrayList();
        ((ArrayList) term6820).add((Object)null);
        LinkedHashMap term6825 = new LinkedHashMap();
        term6784 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6785 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6824 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6785, term6785.getClass(), "tagName", "ATSXJPySio");
        setBooleanField(term6785, term6785.getClass(), "isBlock", true);
        setBooleanField(term6785, term6785.getClass(), "formatAsBlock", false);
        setBooleanField(term6785, term6785.getClass(), "canContainBlock", true);
        setBooleanField(term6785, term6785.getClass(), "canContainInline", false);
        setBooleanField(term6785, term6785.getClass(), "empty", true);
        setBooleanField(term6785, term6785.getClass(), "selfClosing", true);
        setBooleanField(term6785, term6785.getClass(), "preserveWhitespace", false);
        setBooleanField(term6785, term6785.getClass(), "formList", false);
        setBooleanField(term6785, term6785.getClass(), "formSubmit", false);
        setField(term6784, term6784.getClass(), "tag", term6785);
        setField(term6784, term6784.getClass(), "classNames", term6807);
        setField(term6784, term6784.getClass(), "parentNode", null);
        setField(term6784, term6784.getClass(), "childNodes", term6820);
        setField(term6824, term6824.getClass(), "attributes", term6825);
        setField(term6784, term6784.getClass(), "attributes", term6824);
        setField(term6784, term6784.getClass(), "baseUri", "BcENaQFYSd");
        setIntField(term6784, term6784.getClass(), "siblingIndex", 11724947);
        term6849 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6850 = (byte[]) newByteArray(16);
        setField(term6849, term6849.getClass(), "value", term6850);
        setByteField(term6849, term6849.getClass(), "coder", (byte) 89);
        setIntField(term6849, term6849.getClass(), "count", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6784;
        args[1] = term6849;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


