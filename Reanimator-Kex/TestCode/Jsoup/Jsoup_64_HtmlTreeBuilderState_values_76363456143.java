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

public class HtmlTreeBuilderState_values_76363456143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36568;

    public HtmlTreeBuilderState_values_76363456143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36891 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36890 = ((Class) term36891).getDeclaredField((String) "Initial");
        ((Field) term36890).setAccessible(true);
        Object enum92 = ((Field) term36890).get((Object) null);
        Class<? extends Object> term37104 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37103 = ((Class) term37104).getDeclaredField((String) "BeforeHtml");
        ((Field) term37103).setAccessible(true);
        Object enum93 = ((Field) term37103).get((Object) null);
        Class<? extends Object> term37326 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37325 = ((Class) term37326).getDeclaredField((String) "BeforeHead");
        ((Field) term37325).setAccessible(true);
        Object enum94 = ((Field) term37325).get((Object) null);
        Class<? extends Object> term37548 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37547 = ((Class) term37548).getDeclaredField((String) "InHead");
        ((Field) term37547).setAccessible(true);
        Object enum95 = ((Field) term37547).get((Object) null);
        Class<? extends Object> term37758 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37757 = ((Class) term37758).getDeclaredField((String) "InHeadNoscript");
        ((Field) term37757).setAccessible(true);
        Object enum96 = ((Field) term37757).get((Object) null);
        Class<? extends Object> term37992 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37991 = ((Class) term37992).getDeclaredField((String) "AfterHead");
        ((Field) term37991).setAccessible(true);
        Object enum97 = ((Field) term37991).get((Object) null);
        Class<? extends Object> term38211 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38210 = ((Class) term38211).getDeclaredField((String) "InBody");
        ((Field) term38210).setAccessible(true);
        Object enum98 = ((Field) term38210).get((Object) null);
        Class<? extends Object> term38421 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38420 = ((Class) term38421).getDeclaredField((String) "Text");
        ((Field) term38420).setAccessible(true);
        Object enum99 = ((Field) term38420).get((Object) null);
        Class<? extends Object> term38625 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38624 = ((Class) term38625).getDeclaredField((String) "InTable");
        ((Field) term38624).setAccessible(true);
        Object enum100 = ((Field) term38624).get((Object) null);
        Class<? extends Object> term38838 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38837 = ((Class) term38838).getDeclaredField((String) "InTableText");
        ((Field) term38837).setAccessible(true);
        Object enum101 = ((Field) term38837).get((Object) null);
        Class<? extends Object> term39063 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39062 = ((Class) term39063).getDeclaredField((String) "InCaption");
        ((Field) term39062).setAccessible(true);
        Object enum102 = ((Field) term39062).get((Object) null);
        Class<? extends Object> term39282 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39281 = ((Class) term39282).getDeclaredField((String) "InColumnGroup");
        ((Field) term39281).setAccessible(true);
        Object enum103 = ((Field) term39281).get((Object) null);
        Class<? extends Object> term39513 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39512 = ((Class) term39513).getDeclaredField((String) "InTableBody");
        ((Field) term39512).setAccessible(true);
        Object enum104 = ((Field) term39512).get((Object) null);
        Class<? extends Object> term39738 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39737 = ((Class) term39738).getDeclaredField((String) "InRow");
        ((Field) term39737).setAccessible(true);
        Object enum105 = ((Field) term39737).get((Object) null);
        Class<? extends Object> term39945 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39944 = ((Class) term39945).getDeclaredField((String) "InCell");
        ((Field) term39944).setAccessible(true);
        Object enum106 = ((Field) term39944).get((Object) null);
        Class<? extends Object> term40155 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40154 = ((Class) term40155).getDeclaredField((String) "InSelect");
        ((Field) term40154).setAccessible(true);
        Object enum107 = ((Field) term40154).get((Object) null);
        Class<? extends Object> term40371 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40370 = ((Class) term40371).getDeclaredField((String) "InSelectInTable");
        ((Field) term40370).setAccessible(true);
        Object enum108 = ((Field) term40370).get((Object) null);
        Class<? extends Object> term40608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40607 = ((Class) term40608).getDeclaredField((String) "AfterBody");
        ((Field) term40607).setAccessible(true);
        Object enum109 = ((Field) term40607).get((Object) null);
        Class<? extends Object> term40827 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40826 = ((Class) term40827).getDeclaredField((String) "InFrameset");
        ((Field) term40826).setAccessible(true);
        Object enum110 = ((Field) term40826).get((Object) null);
        Class<? extends Object> term41049 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41048 = ((Class) term41049).getDeclaredField((String) "AfterFrameset");
        ((Field) term41048).setAccessible(true);
        Object enum111 = ((Field) term41048).get((Object) null);
        Class<? extends Object> term41280 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41279 = ((Class) term41280).getDeclaredField((String) "AfterAfterBody");
        ((Field) term41279).setAccessible(true);
        Object enum112 = ((Field) term41279).get((Object) null);
        Class<? extends Object> term41514 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41513 = ((Class) term41514).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term41513).setAccessible(true);
        Object enum113 = ((Field) term41513).get((Object) null);
        Class<? extends Object> term41760 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41759 = ((Class) term41760).getDeclaredField((String) "ForeignContent");
        ((Field) term41759).setAccessible(true);
        Object enum114 = ((Field) term41759).get((Object) null);
        term36568 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term36568, 0, enum92);
        setElement(term36568, 1, enum93);
        setElement(term36568, 2, enum94);
        setElement(term36568, 3, enum95);
        setElement(term36568, 4, enum96);
        setElement(term36568, 5, enum97);
        setElement(term36568, 6, enum98);
        setElement(term36568, 7, enum99);
        setElement(term36568, 8, enum100);
        setElement(term36568, 9, enum101);
        setElement(term36568, 10, enum102);
        setElement(term36568, 11, enum103);
        setElement(term36568, 12, enum104);
        setElement(term36568, 13, enum105);
        setElement(term36568, 14, enum106);
        setElement(term36568, 15, enum107);
        setElement(term36568, 16, enum108);
        setElement(term36568, 17, enum109);
        setElement(term36568, 18, enum110);
        setElement(term36568, 19, enum111);
        setElement(term36568, 20, enum112);
        setElement(term36568, 21, enum113);
        setElement(term36568, 22, enum114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36568));
    }

};


