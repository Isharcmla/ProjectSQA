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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsContainingOwnText_1199744512180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5603;
     Object term33960;
     Object term33956;

    public Element_getElementsContainingOwnText_1199744512180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5629 = new ArrayList();
        ((ArrayList) term5629).add((Object)null);
        ((ArrayList) term5629).add((Object)null);
        ((ArrayList) term5629).add((Object)null);
        term5603 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5604 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5625 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5626 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5627 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5633 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5635 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5636 = (Object[]) newArray("java.lang.String", 0);
        setField(term5604, term5604.getClass(), "tagName", "RbVQXSpxXy");
        setBooleanField(term5604, term5604.getClass(), "isBlock", true);
        setBooleanField(term5604, term5604.getClass(), "formatAsBlock", false);
        setBooleanField(term5604, term5604.getClass(), "canContainInline", false);
        setBooleanField(term5604, term5604.getClass(), "empty", false);
        setBooleanField(term5604, term5604.getClass(), "selfClosing", false);
        setBooleanField(term5604, term5604.getClass(), "preserveWhitespace", false);
        setBooleanField(term5604, term5604.getClass(), "formList", true);
        setBooleanField(term5604, term5604.getClass(), "formSubmit", false);
        setField(term5603, term5603.getClass(), "tag", term5604);
        setField(term5625, term5625.getClass(), "referent", null);
        setField(term5626, term5626.getClass(), "lock", term5627);
        setField(term5626, term5626.getClass(), "head", null);
        setLongField(term5626, term5626.getClass(), "queueLength", -5248475803419977214L);
        setField(term5625, term5625.getClass(), "queue", term5626);
        setField(term5625, term5625.getClass(), "next", null);
        setField(term5625, term5625.getClass(), "discovered", null);
        setField(term5603, term5603.getClass(), "shadowChildrenRef", term5625);
        setField(term5603, term5603.getClass(), "childNodes", term5629);
        setIntField(term5633, term5633.getClass(), "size", -461771056);
        setField(term5633, term5633.getClass(), "keys", term5635);
        setField(term5633, term5633.getClass(), "vals", term5636);
        setField(term5603, term5603.getClass(), "attributes", term5633);
        setField(term5603, term5603.getClass(), "baseUri", "YpJbIgJWWv");
        setField(term5603, term5603.getClass(), "parentNode", null);
        setIntField(term5603, term5603.getClass(), "siblingIndex", -243422082);
        ArrayList term33967 = new ArrayList();
        ((ArrayList) term33967).add((Object)null);
        ((ArrayList) term33967).add((Object)null);
        ((ArrayList) term33967).add((Object)null);
        term33960 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term33961 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term33964 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term33965 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term33966 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term33969 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term33970 = (Object[]) newArray("java.lang.String", 0);
        Object[] term33971 = (Object[]) newArray("java.lang.String", 0);
        setField(term33961, term33961.getClass(), "tagName", "RbVQXSpxXy");
        setBooleanField(term33961, term33961.getClass(), "isBlock", true);
        setBooleanField(term33961, term33961.getClass(), "formatAsBlock", false);
        setBooleanField(term33961, term33961.getClass(), "canContainInline", false);
        setBooleanField(term33961, term33961.getClass(), "empty", false);
        setBooleanField(term33961, term33961.getClass(), "selfClosing", false);
        setBooleanField(term33961, term33961.getClass(), "preserveWhitespace", false);
        setBooleanField(term33961, term33961.getClass(), "formList", true);
        setBooleanField(term33961, term33961.getClass(), "formSubmit", false);
        setField(term33960, term33960.getClass(), "tag", term33961);
        setField(term33964, term33964.getClass(), "referent", null);
        setField(term33965, term33965.getClass(), "lock", term33966);
        setField(term33965, term33965.getClass(), "head", null);
        setLongField(term33965, term33965.getClass(), "queueLength", -5248475803419977214L);
        setField(term33964, term33964.getClass(), "queue", term33965);
        setField(term33964, term33964.getClass(), "next", null);
        setField(term33964, term33964.getClass(), "discovered", null);
        setField(term33960, term33960.getClass(), "shadowChildrenRef", term33964);
        setField(term33960, term33960.getClass(), "childNodes", term33967);
        setIntField(term33969, term33969.getClass(), "size", -461771056);
        setField(term33969, term33969.getClass(), "keys", term33970);
        setField(term33969, term33969.getClass(), "vals", term33971);
        setField(term33960, term33960.getClass(), "attributes", term33969);
        setField(term33960, term33960.getClass(), "baseUri", "YpJbIgJWWv");
        setField(term33960, term33960.getClass(), "parentNode", null);
        setIntField(term33960, term33960.getClass(), "siblingIndex", -243422082);
        term33956 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term33957 = (Object[]) newArray("java.lang.Object", 0);
        setField(term33956, term33956.getClass(), "elementData", term33957);
        setIntField(term33956, term33956.getClass(), "size", 0);
        setIntField(term33956, term33956.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term5603, args);
        assertTrue(recursiveEquals(term5603, term33960));
        assertTrue(recursiveEquals(retValue, term33956));
    }

};


