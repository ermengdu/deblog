<#include "../import/top.ftl">

<div class="panel col-xs-12">
    <div class="panel-body">
        <div class="col-xs-6">
            <div class="panel">
                <div class="panel-body">
                    <h5><i class="icon icon-desktop"></i> 系统类型：${osName!}</h5>
                    <h5><i class="icon icon-server"></i> 服务器IP：${hostAddress!}</h5>
                </div>
            </div>
        </div>
        <div class="col-xs-6">
            <div class="panel">
                <div class="panel-body">
                    <h5><i class="icon icon-book"></i> 文章数量：${articleCount!}</h5>
                    <h5><i class="icon icon-stack"></i> 文章类型数量：${articleTypeCount!}</h5>
                    <h5><i class="icon icon-tags"></i> 文章标签数量：${articleTagCount!}</h5>
                    <h5><i class="icon icon-user"></i> 用户数量：${userCount!}</h5>
                </div>
            </div>
        </div>
    </div>
</div>

<#include "../import/bottom.ftl">
