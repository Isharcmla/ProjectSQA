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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_dataset_1324342130102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792;
     Object term10676;
     Object term10624;

    public Element_dataset_1324342130102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term814 = new HashMap();
        Set<Object> term10698 =  ((Map) term814).keySet();
        HashSet term813 = new HashSet((Collection<? extends Object>) term10698);
        ArrayList term826 = new ArrayList();
        ((ArrayList) term826).add((Object)null);
        LinkedHashMap term831 = new LinkedHashMap();
        term792 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term793 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term830 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term793, term793.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term793, term793.getClass(), "isBlock", true);
        setBooleanField(term793, term793.getClass(), "formatAsBlock", false);
        setBooleanField(term793, term793.getClass(), "canContainBlock", false);
        setBooleanField(term793, term793.getClass(), "canContainInline", true);
        setBooleanField(term793, term793.getClass(), "empty", true);
        setBooleanField(term793, term793.getClass(), "selfClosing", true);
        setBooleanField(term793, term793.getClass(), "preserveWhitespace", false);
        setField(term792, term792.getClass(), "tag", term793);
        setField(term792, term792.getClass(), "classNames", term813);
        setField(term792, term792.getClass(), "parentNode", null);
        setField(term792, term792.getClass(), "childNodes", term826);
        setField(term830, term830.getClass(), "attributes", term831);
        setField(term792, term792.getClass(), "attributes", term830);
        setField(term792, term792.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term792, term792.getClass(), "siblingIndex", -2038273078);
        HashMap term10681 = new HashMap();
        Set<Object> term10719 =  ((Map) term10681).keySet();
        HashSet term10680 = new HashSet((Collection<? extends Object>) term10719);
        ArrayList term10682 = new ArrayList();
        ((ArrayList) term10682).add((Object)null);
        LinkedHashMap term10685 = new LinkedHashMap();
        term10676 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10684 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10677, term10677.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term10677, term10677.getClass(), "isBlock", true);
        setBooleanField(term10677, term10677.getClass(), "formatAsBlock", false);
        setBooleanField(term10677, term10677.getClass(), "canContainBlock", false);
        setBooleanField(term10677, term10677.getClass(), "canContainInline", true);
        setBooleanField(term10677, term10677.getClass(), "empty", true);
        setBooleanField(term10677, term10677.getClass(), "selfClosing", true);
        setBooleanField(term10677, term10677.getClass(), "preserveWhitespace", false);
        setField(term10676, term10676.getClass(), "tag", term10677);
        setField(term10676, term10676.getClass(), "classNames", term10680);
        setField(term10676, term10676.getClass(), "parentNode", null);
        setField(term10676, term10676.getClass(), "childNodes", term10682);
        setField(term10684, term10684.getClass(), "attributes", term10685);
        setField(term10676, term10676.getClass(), "attributes", term10684);
        setField(term10676, term10676.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term10676, term10676.getClass(), "siblingIndex", -2038273078);
        LinkedHashMap term10626 = new LinkedHashMap();
        term10624 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term10625 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10625, term10625.getClass(), "attributes", term10626);
        setField(term10624, term10624.getClass(), "this$0", term10625);
        setField(term10624, term10624.getClass(), "keySet", null);
        setField(term10624, term10624.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term792, args);
        assertTrue(recursiveEquals(term792, term10676));
        assertTrue(recursiveEquals(retValue, term10624));
    }

};


