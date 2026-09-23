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
import java.util.ArrayList;

public class Element_ownText_35132743886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6724;

    public Element_ownText_35132743886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6750 = new ArrayList();
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        ((ArrayList) term6750).add((Object)null);
        term6724 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6725 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6746 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6747 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6748 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6754 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6756 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6757 = (Object[]) newArray("java.lang.String", 0);
        setField(term6725, term6725.getClass(), "tagName", "PCipZnmBOF");
        setBooleanField(term6725, term6725.getClass(), "isBlock", false);
        setBooleanField(term6725, term6725.getClass(), "formatAsBlock", true);
        setBooleanField(term6725, term6725.getClass(), "canContainInline", true);
        setBooleanField(term6725, term6725.getClass(), "empty", false);
        setBooleanField(term6725, term6725.getClass(), "selfClosing", false);
        setBooleanField(term6725, term6725.getClass(), "preserveWhitespace", true);
        setBooleanField(term6725, term6725.getClass(), "formList", true);
        setBooleanField(term6725, term6725.getClass(), "formSubmit", true);
        setField(term6724, term6724.getClass(), "tag", term6725);
        setField(term6746, term6746.getClass(), "referent", null);
        setField(term6747, term6747.getClass(), "lock", term6748);
        setField(term6747, term6747.getClass(), "head", null);
        setLongField(term6747, term6747.getClass(), "queueLength", 6005241913654469005L);
        setField(term6746, term6746.getClass(), "queue", term6747);
        setField(term6746, term6746.getClass(), "next", null);
        setField(term6746, term6746.getClass(), "discovered", null);
        setField(term6724, term6724.getClass(), "shadowChildrenRef", term6746);
        setField(term6724, term6724.getClass(), "childNodes", term6750);
        setIntField(term6754, term6754.getClass(), "size", 1050765721);
        setField(term6754, term6754.getClass(), "keys", term6756);
        setField(term6754, term6754.getClass(), "vals", term6757);
        setField(term6724, term6724.getClass(), "attributes", term6754);
        setField(term6724, term6724.getClass(), "baseUri", "zcorEihhLK");
        setField(term6724, term6724.getClass(), "parentNode", null);
        setIntField(term6724, term6724.getClass(), "siblingIndex", 474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term6724, args);
    }

};


