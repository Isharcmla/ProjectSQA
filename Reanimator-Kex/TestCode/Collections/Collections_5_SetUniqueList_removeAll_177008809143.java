package org.apache.commons.collections.list;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_removeAll_177008809143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67810;

    public SetUniqueList_removeAll_177008809143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67810 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term67914 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68018 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68122 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68226 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68330 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68434 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68538 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68642 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68746 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68850 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term68954 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69058 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69162 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69266 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69370 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69474 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69578 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69682 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69786 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69890 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term69994 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70098 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70202 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70306 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70410 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70514 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70618 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70722 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70826 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term70930 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71034 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71138 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71242 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71346 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71450 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71554 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71658 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71762 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71866 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term71970 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72074 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72178 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72282 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72386 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72490 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72594 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72698 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72802 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term72906 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73010 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73114 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73218 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73322 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73426 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73530 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73634 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73738 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73842 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term73946 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74050 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74154 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74258 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74362 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74466 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74570 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74674 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74778 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74882 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term74986 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75090 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75194 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75298 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75402 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75506 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75610 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75714 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75818 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term75922 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76026 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76130 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76234 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76338 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76442 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76546 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76650 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76754 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76858 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term76962 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term77066 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term77170 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term77274 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term77378 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term77482 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term77482, term77482.getClass(), "collection", null);
        setField(term77378, term77378.getClass(), "collection", term77482);
        setField(term77274, term77274.getClass(), "collection", term77378);
        setField(term77170, term77170.getClass(), "collection", term77274);
        setField(term77066, term77066.getClass(), "collection", term77170);
        setField(term76962, term76962.getClass(), "collection", term77066);
        setField(term76858, term76858.getClass(), "collection", term76962);
        setField(term76754, term76754.getClass(), "collection", term76858);
        setField(term76650, term76650.getClass(), "collection", term76754);
        setField(term76546, term76546.getClass(), "collection", term76650);
        setField(term76442, term76442.getClass(), "collection", term76546);
        setField(term76338, term76338.getClass(), "collection", term76442);
        setField(term76234, term76234.getClass(), "collection", term76338);
        setField(term76130, term76130.getClass(), "collection", term76234);
        setField(term76026, term76026.getClass(), "collection", term76130);
        setField(term75922, term75922.getClass(), "collection", term76026);
        setField(term75818, term75818.getClass(), "collection", term75922);
        setField(term75714, term75714.getClass(), "collection", term75818);
        setField(term75610, term75610.getClass(), "collection", term75714);
        setField(term75506, term75506.getClass(), "collection", term75610);
        setField(term75402, term75402.getClass(), "collection", term75506);
        setField(term75298, term75298.getClass(), "collection", term75402);
        setField(term75194, term75194.getClass(), "collection", term75298);
        setField(term75090, term75090.getClass(), "collection", term75194);
        setField(term74986, term74986.getClass(), "collection", term75090);
        setField(term74882, term74882.getClass(), "collection", term74986);
        setField(term74778, term74778.getClass(), "collection", term74882);
        setField(term74674, term74674.getClass(), "collection", term74778);
        setField(term74570, term74570.getClass(), "collection", term74674);
        setField(term74466, term74466.getClass(), "collection", term74570);
        setField(term74362, term74362.getClass(), "collection", term74466);
        setField(term74258, term74258.getClass(), "collection", term74362);
        setField(term74154, term74154.getClass(), "collection", term74258);
        setField(term74050, term74050.getClass(), "collection", term74154);
        setField(term73946, term73946.getClass(), "collection", term74050);
        setField(term73842, term73842.getClass(), "collection", term73946);
        setField(term73738, term73738.getClass(), "collection", term73842);
        setField(term73634, term73634.getClass(), "collection", term73738);
        setField(term73530, term73530.getClass(), "collection", term73634);
        setField(term73426, term73426.getClass(), "collection", term73530);
        setField(term73322, term73322.getClass(), "collection", term73426);
        setField(term73218, term73218.getClass(), "collection", term73322);
        setField(term73114, term73114.getClass(), "collection", term73218);
        setField(term73010, term73010.getClass(), "collection", term73114);
        setField(term72906, term72906.getClass(), "collection", term73010);
        setField(term72802, term72802.getClass(), "collection", term72906);
        setField(term72698, term72698.getClass(), "collection", term72802);
        setField(term72594, term72594.getClass(), "collection", term72698);
        setField(term72490, term72490.getClass(), "collection", term72594);
        setField(term72386, term72386.getClass(), "collection", term72490);
        setField(term72282, term72282.getClass(), "collection", term72386);
        setField(term72178, term72178.getClass(), "collection", term72282);
        setField(term72074, term72074.getClass(), "collection", term72178);
        setField(term71970, term71970.getClass(), "collection", term72074);
        setField(term71866, term71866.getClass(), "collection", term71970);
        setField(term71762, term71762.getClass(), "collection", term71866);
        setField(term71658, term71658.getClass(), "collection", term71762);
        setField(term71554, term71554.getClass(), "collection", term71658);
        setField(term71450, term71450.getClass(), "collection", term71554);
        setField(term71346, term71346.getClass(), "collection", term71450);
        setField(term71242, term71242.getClass(), "collection", term71346);
        setField(term71138, term71138.getClass(), "collection", term71242);
        setField(term71034, term71034.getClass(), "collection", term71138);
        setField(term70930, term70930.getClass(), "collection", term71034);
        setField(term70826, term70826.getClass(), "collection", term70930);
        setField(term70722, term70722.getClass(), "collection", term70826);
        setField(term70618, term70618.getClass(), "collection", term70722);
        setField(term70514, term70514.getClass(), "collection", term70618);
        setField(term70410, term70410.getClass(), "collection", term70514);
        setField(term70306, term70306.getClass(), "collection", term70410);
        setField(term70202, term70202.getClass(), "collection", term70306);
        setField(term70098, term70098.getClass(), "collection", term70202);
        setField(term69994, term69994.getClass(), "collection", term70098);
        setField(term69890, term69890.getClass(), "collection", term69994);
        setField(term69786, term69786.getClass(), "collection", term69890);
        setField(term69682, term69682.getClass(), "collection", term69786);
        setField(term69578, term69578.getClass(), "collection", term69682);
        setField(term69474, term69474.getClass(), "collection", term69578);
        setField(term69370, term69370.getClass(), "collection", term69474);
        setField(term69266, term69266.getClass(), "collection", term69370);
        setField(term69162, term69162.getClass(), "collection", term69266);
        setField(term69058, term69058.getClass(), "collection", term69162);
        setField(term68954, term68954.getClass(), "collection", term69058);
        setField(term68850, term68850.getClass(), "collection", term68954);
        setField(term68746, term68746.getClass(), "collection", term68850);
        setField(term68642, term68642.getClass(), "collection", term68746);
        setField(term68538, term68538.getClass(), "collection", term68642);
        setField(term68434, term68434.getClass(), "collection", term68538);
        setField(term68330, term68330.getClass(), "collection", term68434);
        setField(term68226, term68226.getClass(), "collection", term68330);
        setField(term68122, term68122.getClass(), "collection", term68226);
        setField(term68018, term68018.getClass(), "collection", term68122);
        setField(term67914, term67914.getClass(), "collection", term68018);
        setField(term67810, term67810.getClass(), "collection", term67914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeAll", argTypes, term67810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


